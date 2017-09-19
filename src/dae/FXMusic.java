package dae;

import dae.io.MusicXMLWriter;
import dae.music.data.Score;
import dae.music.parser.DaeMusicScriptVisitor;
import dae.music.parser.MusicScriptLexer;
import dae.music.parser.MusicScriptParser;
import dae.music.parser.MusicScriptVisitor;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author Koen.Samyn
 */
public class FXMusic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            MusicScriptLexer ll = new MusicScriptLexer(new ANTLRFileStream("music/carol_of_the_bells"));
            CommonTokenStream cts = new CommonTokenStream(ll);
            MusicScriptParser lp = new MusicScriptParser(cts);
            MusicScriptVisitor mv = new DaeMusicScriptVisitor();
            //lp.

            for(Token t: cts.getTokens())
            {
                System.out.println(t.getType());
            }
            Score s = (Score)mv.visit(lp.score());
            s.equalizeMeasures();
            
            MusicXMLWriter.writeMusicXML(s, new File("music/pasko.xml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMusic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
