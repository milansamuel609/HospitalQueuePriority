# HospitalQueuePriority

This project demonstrates a basic hospital queue management system using the PriorityQueue data structure in Java. It simulates operations such as adding patients to the queue, viewing the current patient, treating (removing) a patient, printing the queue, and checking the state of the queue.

## Code Summary

The program uses a PriorityQueue<String> to simulate a patient queue in a hospital setting. The PriorityQueue arranges patients in natural (alphabetical) order. It performs the following operations:

i) Add Patients: Adds a predefined list of patient names to the priority queue.

ii) Print Patients: Displays the full queue based on priority (alphabetical order in this case).

iii) View Current Patient: Displays the patient at the head of the queue (who will be treated next).

iv) Remove Patient: Simulates treating a patient by removing the one with the highest priority (alphabetically first).

v) Updated Patients: Displays the patient list after one has been treated.

vi) Remaining Patients: Displays the count of remaining patients and whether the queue is empty.

Sample Output:

```
[Alan, Christopher, Lucas, Milan]
Current patient: Alan
Patient treatment is completed: Alan
Updated patients list[Christopher, Milan, Lucas]
Total patients remaining: 3
Is the patients queue empty or not: false
```

## Key Points

i) Uses Java's PriorityQueue class to simulate a hospital queue where patients are ordered by natural ordering (alphabetical by default).

ii) Demonstrates common queue operations: offer(), peek(), poll(), size(), and isEmpty().

iii) The queue does not preserve insertion order—it reorders based on priority (min-heap behavior).

## Developed By: 

Milan P Samuel
