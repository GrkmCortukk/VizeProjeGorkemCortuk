package tr.edu.medipol.yazilimaraclari.gorkemcortuk;

public class MuhasebeUygulamasi {

	public static void main(String[] args) {
		
		int Ucret = ucretHesaplama(7,35);
		System.out.println(Ucret);
	}
	
	public static int ucretHesaplama(int calisilanSaat, int saatlikUcret) {
		return calisilanSaat * saatlikUcret;
	}
	
}
