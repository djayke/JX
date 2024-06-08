package JXW.Component.DataBinding;

import JXW.Component.Comp;

import java.util.Arrays;
import java.util.List;

public class Table extends Comp {
    public Table() {
        super("table", "");
    }

    /*
            ![1,2,3]![2,2,2]
     */
    public Table(String data) {
        super("table", "");
        List<String> r = Arrays.stream(data.split("!")).toList();
        addRow(r);
    }

    public void addRow(List<String> row){
        addComponent(new Row(row));
    }

    //TODO:addCol

    private class Row extends Comp {
        public Row(List<String> data) {
            super("tr", "");
            data.forEach(r->this.addComponent(new Col(r)));
        }
    }

    private class Col extends Comp {
        public Col(String text) {
            super("td", text);
        }
    }

}