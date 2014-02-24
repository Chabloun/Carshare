package GUI;

import DAO.RoadDAO;
import ENTITIES.Road;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author omar
 */
public class RoadListGUI  extends AbstractTableModel{
    String[] headers={"Id","Driver","Price","Free Seats","Departure City","Arrival City","Round"};
      List<Road> RoadList = new ArrayList<>();
      
      public RoadListGUI()
      {
          RoadDAO rdao = new RoadDAO();
                  RoadList=rdao.DisplayAllRoad();
      }
       @Override
    public int getRowCount() {
        return RoadList.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }
    
    @Override
   public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
          case 0 : return RoadList.get(rowIndex).getId();
          case 1 : return RoadList.get(rowIndex).getDriver();
          case 2 : return RoadList.get(rowIndex).getPrice();
          case 3 : return RoadList.get(rowIndex).getSeat();
          case 4 : return RoadList.get(rowIndex).getCityD();
          case 5 : return RoadList.get(rowIndex).getCityR();
          case 6 : return RoadList.get(rowIndex).getRound();
          default: return null;
       }
    }
    
   
   
 
      @Override
    public String getColumnName(int column) {
        return headers[column];
    }
    
    @Override
public boolean isCellEditable(int rowIndex, int columnIndex) {
    return true; //Toutes les cellules éditables
}
    
    void AddRoad(Road road) {
        RoadList.add(road);
        RoadDAO rdao = new RoadDAO();
        rdao.AddRoad(road);
        fireTableRowsInserted(RoadList.size()-1,RoadList.size()-1);
    }
    
    @Override
public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    if(aValue != null){
        Road road = RoadList.get(rowIndex);
 
        switch(columnIndex){
            case 0:
                road.setId((Integer)aValue);
                break;
            case 1:
                road.setDriver((String)aValue);
                break;
            case 2:
                road.setPrice((Float)aValue);
                break;
              case 3:
                road.setSeat((Integer)aValue);
                break;
            case 4:
                road.setCityD((String)aValue);
                break;
            case 5:
                road.setCityR((String)aValue);
                break;
             case 6:
                road.setRound((Integer)aValue);
                break;
        }
    }
}
@Override
    public Class getColumnClass(int column) {
        switch (column) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Float.class;
            case 3:
                return Integer.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return Integer.class;
                default:
                return String.class;
                }
            }
                
    public void RemoveRoad(int rowIndex)
    {
        RoadDAO rdao = new RoadDAO();
        rdao.RemoveRoad(RoadList.get(rowIndex).getDriver());
        RoadList.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
  
}
    


