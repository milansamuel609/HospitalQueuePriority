import java.util.PriorityQueue;

class Patient {
    PriorityQueue<String> patients = new PriorityQueue<>();

    void addPatients(){
        patients.offer("Milan");
        patients.offer("Alan");
        patients.offer("Lucas");
        patients.offer("Christopher");
    }

    void printPatients(){
        System.out.println(patients);
    }

    void viewPatients(){
        System.out.println("Current patient: " + patients.peek());
    }

    void removePatients(){
        if (patients.isEmpty()){
            System.out.println("No patients are currently in the queue");
        }
        else {
            System.out.println("Patient treatment is completed: " + patients.poll());
        }
    }

    void updatedPatients(){
        System.out.println("Updated patients list" + patients);
    }

    void remainingPatients(){
        System.out.println("Total patients remaining: " + patients.size());
        System.out.println("Is the patients queue empty or not: " + patients.isEmpty());
    }
}

public class HospitalQueuePriority {
    public static void main(String[] args) {
        Patient patient = new Patient();

        patient.addPatients();
        patient.printPatients();
        patient.viewPatients();
        patient.removePatients();
        patient.updatedPatients();
        patient.remainingPatients();
    }
}
