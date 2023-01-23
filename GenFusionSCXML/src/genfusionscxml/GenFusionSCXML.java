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
    // fg.Redundancy(Speech.RAISE, SecondMod.RAISE, Output.RAISE);
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
    fg.Complementary(Speech.NUMBER10, SecondMod.RAISE, Output.RAISE10);
    fg.Complementary(Speech.NUMBER20, SecondMod.RAISE, Output.RAISE20);
    fg.Complementary(Speech.NUMBER30, SecondMod.RAISE, Output.RAISE30);
    fg.Complementary(Speech.NUMBER40, SecondMod.RAISE, Output.RAISE40);
    fg.Complementary(Speech.NUMBER50, SecondMod.RAISE, Output.RAISE50);
    fg.Complementary(Speech.NUMBER60, SecondMod.RAISE, Output.RAISE60);
    fg.Complementary(Speech.NUMBER70, SecondMod.RAISE, Output.RAISE70);
    fg.Complementary(Speech.NUMBER80, SecondMod.RAISE, Output.RAISE80);
    fg.Complementary(Speech.NUMBER90, SecondMod.RAISE, Output.RAISE90);
    fg.Complementary(Speech.NUMBER100, SecondMod.RAISE, Output.RAISE100);
    fg.Complementary(Speech.NUMBER110, SecondMod.RAISE, Output.RAISE110);
    fg.Complementary(Speech.NUMBER120, SecondMod.RAISE, Output.RAISE120);
    fg.Complementary(Speech.NUMBER130, SecondMod.RAISE, Output.RAISE130);
    fg.Complementary(Speech.NUMBER140, SecondMod.RAISE, Output.RAISE140);
    fg.Complementary(Speech.NUMBER150, SecondMod.RAISE, Output.RAISE150);
    fg.Complementary(Speech.NUMBER160, SecondMod.RAISE, Output.RAISE160);
    fg.Complementary(Speech.NUMBER170, SecondMod.RAISE, Output.RAISE170);
    fg.Complementary(Speech.NUMBER180, SecondMod.RAISE, Output.RAISE180);
    fg.Complementary(Speech.NUMBER190, SecondMod.RAISE, Output.RAISE190);
    fg.Complementary(Speech.NUMBER200, SecondMod.RAISE, Output.RAISE200);
    fg.Complementary(Speech.NUMBER210, SecondMod.RAISE, Output.RAISE210);
    fg.Complementary(Speech.NUMBER220, SecondMod.RAISE, Output.RAISE220);
    fg.Complementary(Speech.NUMBER230, SecondMod.RAISE, Output.RAISE230);
    fg.Complementary(Speech.NUMBER240, SecondMod.RAISE, Output.RAISE240);
    fg.Complementary(Speech.NUMBER250, SecondMod.RAISE, Output.RAISE250);
    fg.Complementary(Speech.NUMBER260, SecondMod.RAISE, Output.RAISE260);
    fg.Complementary(Speech.NUMBER270, SecondMod.RAISE, Output.RAISE270);
    fg.Complementary(Speech.NUMBER280, SecondMod.RAISE, Output.RAISE280);
    fg.Complementary(Speech.NUMBER290, SecondMod.RAISE, Output.RAISE290);
    fg.Complementary(Speech.NUMBER300, SecondMod.RAISE, Output.RAISE300);
    fg.Complementary(Speech.NUMBER310, SecondMod.RAISE, Output.RAISE310);
    fg.Complementary(Speech.NUMBER320, SecondMod.RAISE, Output.RAISE320);
    fg.Complementary(Speech.NUMBER330, SecondMod.RAISE, Output.RAISE330);
    fg.Complementary(Speech.NUMBER340, SecondMod.RAISE, Output.RAISE340);
    fg.Complementary(Speech.NUMBER350, SecondMod.RAISE, Output.RAISE350);
    fg.Complementary(Speech.NUMBER360, SecondMod.RAISE, Output.RAISE360);
    fg.Complementary(Speech.NUMBER370, SecondMod.RAISE, Output.RAISE370);
    fg.Complementary(Speech.NUMBER380, SecondMod.RAISE, Output.RAISE380);
    fg.Complementary(Speech.NUMBER390, SecondMod.RAISE, Output.RAISE390);
    fg.Complementary(Speech.NUMBER400, SecondMod.RAISE, Output.RAISE400);
    fg.Complementary(Speech.NUMBER410, SecondMod.RAISE, Output.RAISE410);
    fg.Complementary(Speech.NUMBER420, SecondMod.RAISE, Output.RAISE420);
    fg.Complementary(Speech.NUMBER430, SecondMod.RAISE, Output.RAISE430);
    fg.Complementary(Speech.NUMBER440, SecondMod.RAISE, Output.RAISE440);
    fg.Complementary(Speech.NUMBER450, SecondMod.RAISE, Output.RAISE450);
    fg.Complementary(Speech.NUMBER460, SecondMod.RAISE, Output.RAISE460);
    fg.Complementary(Speech.NUMBER470, SecondMod.RAISE, Output.RAISE470);
    fg.Complementary(Speech.NUMBER480, SecondMod.RAISE, Output.RAISE480);
    fg.Complementary(Speech.NUMBER490, SecondMod.RAISE, Output.RAISE490);
    fg.Complementary(Speech.NUMBER500, SecondMod.RAISE, Output.RAISE500);


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
