package StudentDomen;

import java.util.*;

public class StudentSteam implements Iterable<StudentGroup> {
    /**
     * Номер потока
     * @param steamNumber - номер потока
     */
    private long steamNumber;
    /**
     * Группы на потоке
     */
    private List<StudentGroup> groups;

    public StudentSteam(long number, List<StudentGroup> groups) {
        this.steamNumber = number;
        this.groups = groups;
    }
    /**
     * Анонимный итератор
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < groups.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return groups.get(index++);
            }

        };
    }

    @Override
    public String toString() {
        // Сортировка по количеству студентов (из класса StudentGroup)
        Collections.sort(groups);
        // Сортировка по идентификатору группы
        groups.sort(new Comparator<StudentGroup>() {
            @Override
            public int compare(StudentGroup o1, StudentGroup o2) {
                return o1.groupID - o2.groupID;
            }
        });

        String groupList = "Group list: {\n";
        for (StudentGroup group : groups) {
            groupList += group + "\n";
        }
        groupList += '}';

        return "Stream ("
                + "Number = " + steamNumber
                + ", Group count = " + groups.size() + ")\n" +
                 groupList;
    }
}
