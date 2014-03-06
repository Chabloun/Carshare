package GUI;

import java.io.IOException;
import org.jfree.chart.*;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.*;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.*;

public final class StatisticsGUI extends ApplicationFrame {

    public StatisticsGUI(final String title) throws IOException {
        super(title);
        final CategoryDataset dataset = createDataset();
        final JFreeChart graphe = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(graphe);
        chartPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        setContentPane(chartPanel);
    }
    
    public CategoryDataset createDataset() throws IOException {
        // 0. Création d'un diagramme.
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       //Valeurs statiques
        dataset.addValue(0, "Users Connected", "Users");
        dataset.addValue(12, "Users Subscribed", "Users");
        dataset.addValue(25, "Taux de couverture Indoor", "Inbox");
        dataset.addValue(19, "Taux de couverture Incar", "Road");
       return dataset;
    }
    
    public JFreeChart createChart(CategoryDataset dataset) {
        final JFreeChart chart = ChartFactory.createBarChart3D(
                " Statistiques de l'application ", // chart title
                "", // domain axis label
                "", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips
                true // urls
                );

        final CategoryPlot plot = chart.getCategoryPlot();
        final CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 2.0));
        final CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setItemLabelsVisible(true); 
        return chart;
    }
    
    public static void main(final String[] args) throws IOException {
        final StatisticsGUI demo = new StatisticsGUI("Test de la couverture ");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }
}
