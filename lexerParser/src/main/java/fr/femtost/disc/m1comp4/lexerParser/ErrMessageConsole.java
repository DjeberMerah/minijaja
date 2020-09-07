package fr.femtost.disc.m1comp4.lexerParser;

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
public class ErrMessageConsole
{
    private TextFlow textFlow;
    private boolean isAppend;
    private static boolean hasSeenError = false;

    public ErrMessageConsole(TextFlow textFlow){
        this(textFlow,true);
    }

    public ErrMessageConsole(TextFlow textFlow, boolean isAppend){
        this.textFlow = textFlow;
        this.isAppend = isAppend;
    }

    public static boolean isHasSeenError() {
        return hasSeenError;
    }

    public void redirectErr()
    {
        redirectErr(Color.DARKRED);
    }

    public void redirectErr(Color textColor)
    {
        ConsoleStream cs = new ConsoleStream(textColor);
        System.setErr( new PrintStream(cs, true) );
    }

    public static void reset(){
        hasSeenError = false;
    }

   class ConsoleStream extends ByteArrayOutputStream {
        private Color color;

        public ConsoleStream(Color color){
            this.color = color;
        }

        public void flush(){
            String message = toString();

            if (message.length() == 0) return;
            if (isAppend)
                append(message);

            reset();
        }

        public void append(String message){
            Text text = new Text(message);
            text.setFill(color);
            textFlow.getChildren().add(text);
            hasSeenError = true;
        }

   }
}