package scxmlgen.Modalities;

import scxmlgen.interfaces.IOutput;



public enum Output implements IOutput{
    
    START("[START]"),
	END("[END]"),
	RESTART("[RESTART]"),
	CONTINUE("[CONTINUE]"),
	CHECK("[CHECK]"),
	CALL("[CALL]"),
	RAISE("[RAISE]"),
	FOLD("[FOLD]"),
	ALLIN("[ALLIN]"),
	TABLE("[TABLE]"),
	HAND("[HAND]"),
	POT("[POT]"),
	LIMIT("[LIMIT]"),
	CASH("[CASH]"),
	YES("[YES]");
    ;
    
    
    
    private String event;

    Output(String m) {
        event=m;
    }
    
    public String getEvent(){
        return this.toString();
    }

    public String getEventName(){
        return event;
    }
}
