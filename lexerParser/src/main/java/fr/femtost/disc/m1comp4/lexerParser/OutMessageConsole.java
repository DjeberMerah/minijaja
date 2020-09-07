package fr.femtost.disc.m1comp4.lexerParser;

import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


/*
 *  Create a simple console to display text messages.
 *
 *  Messages can be directed here from different sources. Each source can
 *  have its messages displayed in a different color.
 *
 *  Messages can either be appended to the console or inserted as the first
 *  line of the console
 *
 *  You can limit the number of lines to hold in the Document.
 */
public class OutMessageConsole
{
    private TextFlow textFlow;
    private boolean isAppend;
    private int messageLines;

    public OutMessageConsole(TextFlow textFlow){
        this(textFlow,true);
    }

    public OutMessageConsole(TextFlow textFlow, boolean isAppend){
        this.textFlow = textFlow;
        this.isAppend = isAppend;
    }

    public void redirectOut()
    {
        redirectOut(Color.BLACK, null);
    }

    public void redirectOut(Color textColor, PrintStream printStream)
    {
        ConsoleStream cs = new ConsoleStream(textColor, printStream);
        System.setOut( new PrintStream(cs, true) );
    }

   class ConsoleStream extends ByteArrayOutputStream {
        private final String EOL = System.getProperty("line.separator");
        private PrintStream printStream;
        private Color color;

        public ConsoleStream(Color color, PrintStream printStream){
            this.color = color;
            this.printStream = printStream;
        }

        public void flush(){
            String message = toString();

            if (message.length() == 0) return;
            append(message);

            reset();
        }

        public void append(String message){
            Text text = new Text(message);
            text.setFill(color);
            textFlow.getChildren().add(text);
        }

   }
}