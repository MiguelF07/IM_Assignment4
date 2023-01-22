/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genfusionscxml;

import java.io.IOException;
import scxmlgen.Fusion.FusionGenerator;
import scxmlgen.Modalities.Output;
import scxmlgen.Modalities.Speech;
import scxmlgen.Modalities.SecondMod;

/**
 *
 * @author nunof
 */
public class GenFusionSCXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

    FusionGenerator fg = new FusionGenerator();
  
    
    // fg.Sequence(Speech.SQUARE, SecondMod.RED, Output.SQUARE_RED);
    // fg.Sequence(Speech.SQUARE, SecondMod.BLUE, Output.SQUARE_BLUE);
    // fg.Sequence(Speech.SQUARE, SecondMod.YELLOW, Output.SQUARE_YELLOW);
    // fg.Complementary(Speech.TRIANGLE, SecondMod.RED, Output.TRIANGLE_RED);
    // fg.Complementary(Speech.TRIANGLE, SecondMod.BLUE, Output.TRIANGLE_BLUE);
    // fg.Complementary(Speech.TRIANGLE, SecondMod.YELLOW, Output.TRIANGLE_YELLOW);
    // fg.Complementary(Speech.CIRCLE, SecondMod.RED, Output.CIRCLE_RED);
    // fg.Complementary(Speech.CIRCLE, SecondMod.BLUE, Output.CIRCLE_BLUE);
    // fg.Complementary(Speech.CIRCLE, SecondMod.YELLOW, Output.CIRCLE_YELLOW);
    
    // fg.Single(null, null);

    fg.Redundancy(Speech.START, SecondMod.START, Output.START);
    fg.Redundancy(Speech.CHECK, SecondMod.CHECK, Output.CHECK);
    fg.Redundancy(Speech.CALL, SecondMod.CALL, Output.CALL);
    fg.Redundancy(Speech.RAISE, SecondMod.RAISE, Output.RAISE);
    fg.Redundancy(Speech.FOLD, SecondMod.FOLD, Output.FOLD);
    fg.Single(Speech.END, Output.END);
    fg.Single(Speech.RESTART, Output.RESTART);
    fg.Single(Speech.CONTINUE, Output.CONTINUE);
    fg.Single(Speech.ALLIN, Output.ALLIN);
    fg.Single(Speech.TABLE, Output.TABLE);
    fg.Single(Speech.HAND, Output.HAND);
    fg.Single(Speech.POT, Output.POT);
    fg.Single(Speech.LIMIT, Output.LIMIT);
    fg.Single(Speech.CASH, Output.CASH);
    fg.Single(Speech.YES, Output.YES);


    // START("[START]",1500),
	// END("[END]",1500),
	// RESTART("[RESTART]",1500),
	// CONTINUE("[CONTINUE]",1500),
	// CHECK("[CHECK]",1500),
	// CALL("[CALL]",1500),
	// RAISE("[RAISE]",1500),
	// FOLD("[FOLD]",1500),
	// ALLIN("[ALLIN]",1500),
	// TABLE("[TABLE]",1500),
	// HAND("[HAND]",1500),
	// POT("[POT]",1500),
	// LIMIT("[LIMIT]",1500),
	// CASH("[CASH]",1500),
	// YES("[YES]",1500);
    
    //fg.Single(Speech.CIRCLE, Output.CIRCLE);  //EXAMPLE
    //fg.Redundancy(Speech.CIRCLE, SecondMod.CIRCLE, Output.CIRCLE);  //EXAMPLE
    
    fg.Build("fusion.scxml");
        
        
    }
    
}
