package org.nnlabs.component;

import java.util.ArrayList;

/**
 * Layer represents a layer at the neural network.
 * Each layer owns n neurons.
 * 
 */

public class Layer {
	private ArrayList<Neuron> networkLayer = new ArrayList<>();

    public Layer(int numberOfNeurons){
        for (int i = 0; i < numberOfNeurons; i++) {
            networkLayer.add(new Neuron());
        }
    }

    public Neuron getNeuron(int index){
        if(index <= networkLayer.size() && index >= 0){
            return networkLayer.get(index);
        }
        else{
            return null;
        }
    }

    public int getNumberOfNeurons(){
        return networkLayer.size();
    }
}
