package hw3;

public class Program {

    public static void main(String[] args) {

        LinkedList<Employee> linkedList = new LinkedList<>();
        
        linkedList.addFirst(new Employee("FFFF", 34));
        linkedList.addFirst(new Employee("AAAAA", 45));
        linkedList.addFirst(new Employee("CCCCC", 44));
        linkedList.addFirst(new Employee("AAAAA", 22));
        linkedList.addFirst(new Employee("MMMMMM", 18));
        linkedList.addFirst(new Employee("AAAAA", 55));
        
        
        System.out.println("Compaire -----------------");
        
        Employee employee1 = new Employee("AAA", 33);
        Employee employee2 = new Employee("AAA", 33);
        
        System.out.println(employee1.equals(employee2));
        System.out.println();
        
        
        System.out.println("Search ------------------");
        
        Employee res = linkedList.contains(new Employee("User3", 22));
        
        System.out.println(res);
        System.out.println();
        
        
        System.out.println("Output ------------------");
        
        System.out.println(linkedList);
        System.out.println();
        
        
        System.out.println("Sort Ascending ------------------");
        
        linkedList.sort(new EmployeeComparator(SortDirect.Ascending));
        
        System.out.println(linkedList);
        System.out.println();


        System.out.println("Sort Descending ------------------");

        linkedList.sort(new EmployeeComparator(SortDirect.Descending));
        
        System.out.println(linkedList);
        System.out.println();


        System.out.println("Remove ------------------");
        
        linkedList.removeFirst();

        linkedList.removeLast();

        System.out.println(linkedList);
        System.out.println();


        System.out.println("Revert ------------------");

        linkedList.revert();

        System.out.println(linkedList);
        System.out.println();

    }

}