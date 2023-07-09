# Collections and Sorting Poem Verses

# Introduction

In this quiz, the goal is to learn about Java collections by sorting the verses of a poem stored in an input file. The verses are initially given in a random order, and you will use various collection classes to store and sort the verses. Finally, the sorted verses will be written back to separate files based on the collection type used.

# Input

Read the input file poem.txt which contains the verses of the poem.

# ArrayList

1-Store the verses of the poem in an ArrayList.

2-Iterate over the ArrayList and write the verses to the file poemArrayList.txt.

# Sorting with idComparator

1-Create a class idComparator that implements the Comparator interface to sort verses by their id.

2-Use idComparator to sort the ArrayList using Collections.sort.

3-Write the sorted verses to the file poemArrayListOrderByID.txt.

# HashSet

1-Store the verses of the poem in a HashSet.

2-Iterate over the HashSet and write the verses to the file poemHashSet.txt.

# TreeSet

1-Store the verses of the poem in a TreeSet.

2-Iterate over the TreeSet and write the verses to the file poemTreeSet.txt.

# TreeSet with idComparator

1-Use the idComparator to store the verses in the TreeSet in the order of their id.

2-Iterate over the TreeSet and write the verses to the file poemTreeSetOrderByID.txt.

# HashMap

1-Store the verses of the poem in a HashMap, using the id as the key and the verse as the value.

2-Iterate over the HashMap and write the verses to the file poemHashMap.txt.

# Output

1-Each collection type will have its own output file as specified above:


ArrayList: poemArrayList.txt

Sorted ArrayList: poemArrayListOrderByID.txt

HashSet: poemHashSet.txt

TreeSet: poemTreeSet.txt

Sorted TreeSet: poemTreeSetOrderByID.txt

HashMap: poemHashMap.txt
