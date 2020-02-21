
package test;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;
    
    public MyModel(){}
    
    public MyModel(Object [][] data, String[] columnsName){
        this.columns= columnsName;
        this.rows= data;
    }
    
    public Class getColumnClass(int column)
    {
        Object value=this.getValueAt(0,column);
return (value==null?Object.class:value.getClass());
        }
    @Override
    public int getRowCount() {
        
        return this.rows.length;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
     return this.columns.length;   
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnindex) {
       return this.rows[rowIndex][columnindex]; 
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getColumnName(int col){
        return this.columns[col];
    }
    
}
