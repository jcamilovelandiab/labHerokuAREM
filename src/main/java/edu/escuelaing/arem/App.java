package edu.escuelaing.arem;

import java.lang.Math; 

/**
 * @author Juan Camilo Velandia Botello
 */
public class App 
{
    
    /**
     * @param list The linked list on which the mean will be calculated.
     * @return The mean calculated from the list elements.
     */
    public static Double mean(LinkedList<Double> list) {
    	int n = list.getSize();
    	return (double)sum(list)/(double)n;
    }
    
    /**
     * @param list The linked list on which the standard deviation will be calculated.
     * @return The standard deviation calculated from the list elements.
     */
    public static Double standardDeviation(LinkedList<Double> list) {
    	int n = list.getSize();
    	Double mean= mean(list), stDeviation = (double) 0;
    	Node<Double> temp = list.getHead();
		for(int i=0; i<list.getSize(); i++) {
			Double xi = temp.getData();
			stDeviation += Math.pow(xi-mean, 2);			
			temp = temp.getNext();
		}
    	return Math.sqrt(stDeviation/(double)(n-1));
    }
    
    /**
     * @param list The linked list on which the sum of its elements will be calculated.
     * @return The sum of the list elements.
     */
    public static Double sum(LinkedList<Double> list) {
    	Double sum = (double)0;
    	Node<Double> temp = list.getHead();
		for(int i=0; i<list.getSize(); i++) {
			sum += temp.getData();
			temp = temp.getNext();
		}
		return sum;
    }
  
}