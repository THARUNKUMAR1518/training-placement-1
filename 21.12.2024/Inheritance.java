class Student extends Person{
	private int[] testScores;

    Student(String firstName, String lastName, int id, int[] scores)
    {
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    char calculate()
    {
        int average = 0;
        for(int num : testScores)
            average += num;
        
        average /= testScores.length;
        
        if(average >= 90) return 'O';
        if(average >= 80) return 'E';
        if(average >= 70) return 'A';
        if(average >= 55) return 'P';
        if(average >= 40) return 'D';
        return 'T';
    }
}
