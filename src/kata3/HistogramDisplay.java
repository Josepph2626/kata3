package kata3;


import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Entrar
 */
public class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay() {
        super("Histograma");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
        
    }
    private JPanel createPanel(){
       ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
       chartPanel.setPreferredSize(new Dimension(500,400));
       return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma de emails",
                "dominios email", 
                "nº de emails recibidos",
                dataSet,
                PlotOrientation.VERTICAL,
                false,
                rootPaneCheckingEnabled, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(15, "", "ulpgc.es");
        dataset.addValue(8, "", "ull.es");
        dataset.addValue(7, "", "gmail.es");
        dataset.addValue(22, "", "gmail.com");
        dataset.addValue(11, "", "hotmail.com");
        return dataset;
    }
}