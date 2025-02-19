package training.taylor.timetracker.core;

import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

@Component
public class Tracker {
    private final List<TimeEntry> entries = new ArrayList<>();

    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    public int size() {
        return entries.size();
    }

    public TimeEntry get(int index) {
        if (index < 0 || index >= entries.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        return entries.get(index);
    }
}
