import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;

public class ListTableModel <T> implements TableModel {

    private List<List<T>> source;

    public ListTableModel(List<List<T>> source) {

        this.source = source;

    }

    @Override
    public int getRowCount() {
        return source.size();
    }

    @Override
    public int getColumnCount() {
        int max = 0;
        for(List<T> row : source) {
            max = Math.max(max, row.size());
        }
        return max;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return "Column " + columnIndex;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return source.get(0).get(0).getClass();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<T> row = source.get(rowIndex);
        if(columnIndex >= row.size())
            return null;
        else
            return row.get(columnIndex);
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

}
