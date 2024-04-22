# Task4-LiveData

Task: Create a `ViewModel` that holds a `LiveData` integer value representing a score. The ViewModel should have methods to increment and decrement the score. Implement an Activity that observes this `LiveData` and updates a TextView with the current score. The Activity should also have buttons to increase and decrease the score.

Input Format: Initial score starts at 0.

Constraints: The score can range between 0 and 100.

Output Format: The TextView in the Activity should display the current score, updating every time the increment or decrement buttons are pressed. This value should remain consistent across configuration changes.
