package innerClassEx;

import java.util.ArrayList;
import java.util.List;

public class CardProgram{
	public static void main(String[] args) {
		CardEx1 card = new CardEx1("pink");
		for(int i=0;i<CardEx1.CARD_TOTAL_NUM;i++) {
			System.out.print(card.cardList.get(i).num+" ");
			System.out.print(card.cardList.get(i).type+" ");
			System.out.println(card.cardList.get(i).color+" ");
		}
	}
}




class CardEx1{
	//iv, cv
	final static int CARD_TOTAL_NUM = 21;
	 int num;
	 char type;
	 String color;
	 List<CardEx1> cardList;
	 
	//default constructor
	public CardEx1() {
		
	}
	
	//user constructor1
	public CardEx1(String color) {
		this.cardList = new ArrayList<CardEx1>();
		for(int i=0;i<CARD_TOTAL_NUM;i++) {
			cardList.add(i, new CardEx1(i+1, (char)(i+65), color));
		}
	}
	
	//user constructor2
	public CardEx1(int num, char type, String color) {
		this.num = num;
		this.type = type;
		this.color = color;
	}
	
	
}