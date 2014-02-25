/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author yahia
 */
   class CustomCellRender extends JLabel implements TableCellRenderer
{
    @Override
    public Component getTableCellRendererComponent(JTable table,
                                                   Object value,
                                                   boolean hasFocus,
                                                   boolean isSelected,
                                                   int row,
                                                   int col)
    {
        setText(value.toString()); 
        setPreferredSize(new Dimension(100, 50));
        setForeground(Color.WHITE);
        setHorizontalAlignment(JLabel.CENTER);
        setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        return this;
    }
} 

