/**
 * Universidad del Valle de Guatemala
 * Proyecto Final POO
 * File: Main
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Juan Miguel González-Campo 21077
 * @author Mario Puente 21290
 * @author Sebastián Reyes 21139
 */

 /*imports */
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;

/*esta es la clase para tabla de puntajes */
public class ListTableModel <T> implements TableModel {

    /*lista */
    private List<List<T>> source;

    public ListTableModel(List<List<T>> source) {

        this.source = source;

    }

    /*override para tener las filas */
    @Override
    public int getRowCount() {
        return source.size();
    }

    /*override para las columnas */
    @Override
    public int getColumnCount() {
        int max = 0;
        for(List<T> row : source) {
            max = Math.max(max, row.size());
        }
        return max;
    }

    /*override para el nombre de columnas */
    @Override
    public String getColumnName(int columnIndex) {
        return "Column " + columnIndex;
    }

    /*override para el tipo de columna */
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return source.get(0).get(0).getClass();
    }

    /*override para que las celdas no sean editables */
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    /*override para los valores */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<T> row = source.get(rowIndex);
        if(columnIndex >= row.size())
            return null;
        else
            return row.get(columnIndex);
    }

    /*override para set los valores */
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    /*override para agregar tabla */
    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    /*override para quitar tabla */
    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

}
