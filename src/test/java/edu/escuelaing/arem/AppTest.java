package edu.escuelaing.arem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import edu.escuelaing.arem.LinkedList;
import edu.escuelaing.arem.App;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest{

	@Test
    
    public void meanTest1() throws IOException {
		LinkedList<Double> list = new LinkedList<Double>();
        BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
        String str = null;
        while((str = br.readLine()) != null) {
        	Double number = Double.parseDouble(str);
        	list.add_back(number);
        }
        Double value = App.mean(list);
        assertEquals(String.format(Locale.US, "%.2f", value),"550.60");
        br.close();
    }
    
    @Test
    public void meanTest2() throws IOException {
        LinkedList<Double> list = new LinkedList<Double>();
        BufferedReader br = new BufferedReader(new FileReader("test2.txt"));
        String str = null;
        while((str = br.readLine()) != null) {
            Double number = Double.parseDouble(str);
            list.add_back(number);
        }
        Double value = App.mean(list);
        assertEquals(String.format(Locale.US, "%.2f", value),"60.32");
        br.close();
   }
	
	@Test
	public void standardDeviationTest1() throws IOException {
		LinkedList<Double> list = new LinkedList<Double>();
        BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
        String str = null;
        while((str = br.readLine()) != null) {
        	Double number = Double.parseDouble(str);
        	list.add_back(number);
        }
        Double value = App.standardDeviation(list);
        assertEquals(String.format(Locale.US, "%.2f", value),"572.03");
        br.close();
    }
    
    @Test
    public void standardDeviationTest2() throws IOException {
        LinkedList<Double> list = new LinkedList<Double>();
        BufferedReader br = new BufferedReader(new FileReader("test2.txt"));
        String str = null;
        while((str = br.readLine()) != null) {
            Double number = Double.parseDouble(str);
            list.add_back(number);
        }
        Double value = App.standardDeviation(list);
        assertEquals(String.format(Locale.US, "%.2f", value),"62.26");
        br.close();
   }

}