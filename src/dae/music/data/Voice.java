package dae.music.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Koen.Samyn
 */
public class Voice {

    int id;
    private ArrayList<Measure> measures = new ArrayList<Measure>();

    public Voice(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void addMeasure(Measure m) {
        measures.add(m);
    }

    public void addMeasures(List<Measure> measures) {
        this.measures.addAll(measures);
    }

    public Iterable<Measure> getMeasures() {
        return measures;
    }

    public int getNrOfMeasures() {
        return measures.size();
    }

    public void insertEmptyMeasures(int ms) {
        if (ms > 0) {
            for (int i = 0; i < ms; ++i) {
                measures.add(new Measure());
            }
        }
    }
}
