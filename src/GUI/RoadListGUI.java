package GUI;

import DAO.RoadDAO;
import ENTITIES.Road;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author omar
 */
public class RoadListGUI  extends AbstractTableModel{
    String[] headers={"Id","Driver","Price","Free Seats","Departure City","Arrival City","Round","Departure Date","Arrival Date","Departure Hour ","Arrival Hour ","Car"};
      List<Road> RoadList = new ArrayList<>();
      
      public RoadListGUI()
      {
          RoadDAO rdao = new RoadDAO();
                  RoadList=rdao.DisplayAllRoad();
      }
      public RoadListGUI(String a , String b)
      {
          RoadDAO rdao = new RoadDAO();
                  RoadList=rdao.RechercherRoad(a, b);
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
          case 7 : return RoadList.get(rowIndex).getDateD();
          case 8 : return RoadList.get(rowIndex).getDateR();
          case 9 : return RoadList.get(rowIndex).getHourD();
          case 10 : return RoadList.get(rowIndex).getHourR();
          case 11 : return RoadList.get(rowIndex).getCar();
              
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
        RoadDAO rdao=new RoadDAO();
        
        switch(columnIndex){
          case 0:
                road.setId((int)aValue);
                break;
            case 1:
                road.setDriver((String)aValue);
                break;
            case 2:
                road.setPrice((float)aValue);
                break;
              case 3:
                road.setSeat((int)aValue);
                break;
            case 4:
                road.setCityD((String)aValue);
                break;
            case 5:
                road.setCityR((String)aValue);
                break;
             case 6:
                road.setRound((String)aValue);
                break;
             case 7:
                road.setDateD((Date)aValue);
                break;
              case 8:
                road.setDateR((Date)aValue);
                break;
              case 9:
                road.setHourD((String)aValue);
                break;
              case 10:
                road.setHourR((String)aValue);
                break;
              case 11:
                road.setCar((String)aValue);
                break;
        }
       
        rdao.updateRoad(road);
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
                return String.class;
            case 7:
                return Date.class;
             case 8:
                return Date.class;
             case 9:
                return String.class;
             case 10:
                return String.class;
             case 11:
                return String.class;
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
    


