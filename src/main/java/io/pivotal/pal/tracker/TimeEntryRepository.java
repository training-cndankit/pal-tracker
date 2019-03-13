package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {

    TimeEntry create(TimeEntry timeEntry);

    TimeEntry find(Long id);

    List<TimeEntry> list();

    TimeEntry update(Long id, TimeEntry timeEntry);

    void delete(Long id);

    //public void find_MissingEntry(long id);
    // void update();
    // public void update_MissingEntry();
    // public void deleteKeepsTrackOfLatestIdProperly();
}
