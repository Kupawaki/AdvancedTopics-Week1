# AdvancedTopics-Week1

## Major Developments

### Goals:  
The goals for this week were to create an app template that included a customizable toolbar, a premade menu file that could be easily changed, and a simple navigation drawer.

### Problems Encountered

#### Problem 1: Clicking the Hambuger Menu </br>
After adding the onOptionsItemSelected function, so I could deal with toolbar menu clicks, the hamburger menu no longer opened.
##### Status: Solved </br>
The above mentioned function returned type boolean. I had it set to true by default. This meant my function was intercepting all clicks, instead of letting the nav drawer do whatever it is that it does. This problem was solved by instead returning super.onOptionsItemSelected().

### App Completion Status

