package tr.edu.medipol.yazilimaraclari.gorkemcortuk;

import static org.junit.Assert.*;

import org.junit.*;

public class MuhasebeUygulamasiTest {

	@Test
	public void testUcretHesaplama() {
		int saat = 6;
		int ucr = 30;
		
		int ucretSonuc = MuhasebeUygulamasi.ucretHesaplama(saat, ucr);
		
		Assert.assertEquals(180,ucretSonuc);
	}
}
