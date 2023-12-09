# Data Processing and Storage

## To Run

In the project directory, the program can be run in any Java enviroment and is interactive through the terminal.

All transactions are completed via terminal text prompts and corresponding user inputs. 

Each method corresponds to a numerical value when prompted to run a command:  
```
1: Get
2: Begin transaction
3: Put
4: Commit,
5: Rollback
6: End the program
```
IllegalStateException will be thrown and program will therefore end if:
- actions that needs to be done during a transaction (put, rollback, commit) if done outside of a transaction. 
- if begin transcation is called while a transaction is already active.

## To Become an “Official” Assignment
For this to improve to become an “Official” Assignment, it is suggested to adopt a standardized programming language such as Java or Python to facilitate the grading process. 
Given that students have the flexibility to choose their preferred language and setup, there isn't a consistent testing shell that graders can swiftly employ to evaluate submitted code. 
This challenge can be addressed by furnishing a template similar to those used in previous assignments like the React Counter Assignment. 
Additionally, instead of specifying that the program must generate an error, it could simply notify the user of any deviations from the intended actions. 
This adjustment would eliminate the need for graders to restart the program each time they wish to assess its functionality and overall improve grade efficiency.
