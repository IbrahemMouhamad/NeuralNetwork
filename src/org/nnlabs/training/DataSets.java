package org.nnlabs.training;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DataSets stores all training sets.
 */

public class DataSets {
	 private ArrayList<Double[]> input;
	 private ArrayList<Double[]> target;

	public DataSets(){
		this.input = new ArrayList<>();
		this.target = new ArrayList<>();
	}
	

	public void addDataSet(Double[] input, Double[] target){
		this.input.add(input);
	    this.target.add(target);
	}

	public Double[][] getDataSet(int index){
		return new Double[][]{this.input.get(index),this.target.get(index)};
	}

	public int size(){
        return this.input.size();
	}
}
