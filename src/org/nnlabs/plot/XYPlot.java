package org.nnlabs.plot;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeriesCollection;

public class XYPlot extends JFrame  {

	private static final long serialVersionUID = 1L;
	/**
	 * @param title  the frame title.
	 */
	public XYPlot(final String title, final String xTitle, final String yTitle, XYSeriesCollection dataset) {
		super(title);
		JPanel chartPanel = createChartPanel(title, xTitle, yTitle, dataset);
		add(chartPanel, BorderLayout.CENTER);

		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	private JPanel createChartPanel(final String title, final String xTitle, final String yTitle, XYSeriesCollection dataset) {
	    String chartTitle = title;
	    String xAxisLabel = xTitle;
	    String yAxisLabel = yTitle;
	 
	    JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
	            xAxisLabel, yAxisLabel, dataset);
	 
	    return new ChartPanel(chart);
	}
}
