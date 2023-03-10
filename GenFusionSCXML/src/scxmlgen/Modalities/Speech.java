/* 
  *   Speech.java generated by speechmod 
 */   

package scxmlgen.Modalities; 

import scxmlgen.interfaces.IModality; 

public enum Speech implements IModality{  

	SQUARE("[shapeSQUARE]",1500),
        TRIANGLE("[shape][TRIANGLE]",1500),
        CIRCLE("[shape][CIRCLE]",1500),
	START("[START]",1500),
	END("[END]",1500),
	RESTART("[RESTART]",1500),
	CONTINUE("[CONTINUE]",1500),
	CHECK("[CHECK]",1500),
	CALL("[CALL]",1500),
	RAISE("[RAISE]",1500),
	FOLD("[FOLD]",1500),
	ALLIN("[ALLIN]",1500),
	TABLE("[TABLE]",1500),
	HAND("[HAND]",1500),
	POT("[POT]",1500),
	LIMIT("[LIMIT]",1500),
	CASH("[CASH]",1500),
	YES("[YES]",1500),
	NUMBER10("[NUMBER10]",1500),
	NUMBER20("[NUMBER20]",1500),
	NUMBER30("[NUMBER30]",1500),
	NUMBER40("[NUMBER40]",1500),
	NUMBER50("[NUMBER50]",1500),
	NUMBER60("[NUMBER60]",1500),
	NUMBER70("[NUMBER70]",1500),
	NUMBER80("[NUMBER80]",1500),
	NUMBER90("[NUMBER90]",1500),
	NUMBER100("[NUMBER100]",1500),
	NUMBER110("[NUMBER110]",1500),
	NUMBER120("[NUMBER120]",1500),
	NUMBER130("[NUMBER130]",1500),
	NUMBER140("[NUMBER140]",1500),
	NUMBER150("[NUMBER150]",1500),
	NUMBER160("[NUMBER160]",1500),
	NUMBER170("[NUMBER170]",1500),
	NUMBER180("[NUMBER180]",1500),
	NUMBER190("[NUMBER190]",1500),
	NUMBER200("[NUMBER200]",1500),
	NUMBER210("[NUMBER210]",1500),
	NUMBER220("[NUMBER220]",1500),
	NUMBER230("[NUMBER230]",1500),
	NUMBER240("[NUMBER240]",1500),
	NUMBER250("[NUMBER250]",1500),
	NUMBER260("[NUMBER260]",1500),
	NUMBER270("[NUMBER270]",1500),
	NUMBER280("[NUMBER280]",1500),
	NUMBER290("[NUMBER290]",1500),
	NUMBER300("[NUMBER300]",1500),
	NUMBER310("[NUMBER310]",1500),
	NUMBER320("[NUMBER320]",1500),
	NUMBER330("[NUMBER330]",1500),
	NUMBER340("[NUMBER340]",1500),
	NUMBER350("[NUMBER350]",1500),
	NUMBER360("[NUMBER360]",1500),
	NUMBER370("[NUMBER370]",1500),
	NUMBER380("[NUMBER380]",1500),
	NUMBER390("[NUMBER390]",1500),
	NUMBER400("[NUMBER400]",1500),
	NUMBER410("[NUMBER410]",1500),
	NUMBER420("[NUMBER420]",1500),
	NUMBER430("[NUMBER430]",1500),
	NUMBER440("[NUMBER440]",1500),
	NUMBER450("[NUMBER450]",1500),
	NUMBER460("[NUMBER460]",1500),
	NUMBER470("[NUMBER470]",1500),
	NUMBER480("[NUMBER480]",1500),
	NUMBER490("[NUMBER490]",1500),
	NUMBER500("[NUMBER500]",1500);
	


private String event; 
private int timeout;
Speech(String m, int time) {
	event=m;
	timeout=time;
}
@Override
public int getTimeOut(){
	return timeout;
}
@Override
public String getEventName(){
	return event;
}
@Override
public String getEvName(){
	return getModalityName().toLowerCase() +event.toLowerCase();
}

}
