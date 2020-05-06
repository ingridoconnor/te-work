# Introduction to Developer Tools - Lecture Notes 
###### (04/09/2018)

## **Overview of Session** 
(Brief description of session and content)

You have used a computer before, from a laptop to a cellphone, but most of that use has been to consume content or use someone elses' applications. Now we are going to create our own applications. But before we do that, we need to learn how to use our computers as tools and not just entertainment devices.

## **[Session Objectives](http://book.techelevator.com/java/01-introduction-to-tools/1_intro.html):** 
(What do we want the students to be able to do upon completion)
  
- Students should be able to navigate files using the UI of their laptops
- Students should be able to find and open a command line application
- Students should have all three repositories set up on their laptops (lecture, exercises, and solutions)
- Students should be able to open Visual Studio Code as a text editor
- Students should understand that there is a basic command line on their computers and how to use it
- Students should understand pathing and hierarchical, parent-child structures
- Students should remember the `cd`, `ls`, and `pwd` commands and how to use them
- Students should understand what source control is
- Students should have an understanding of what `git` is and what the workflow of it will be in the class

## **Classroom Preparation**  

(What needs to be done before session starts)

1. Create a copy of this machine setup script and modify for your class: https://bitbucket.org/snippets/te-curriculum/kejK9E

    Put it as a snippet on Bitbucket and accessible to your cohort.

1. Write Unix Shell Commands on the Whiteboard
    | Command                 | Description                                 |
    |-------------------------|---------------------------------------------|
    | pwd                     | Prints out the current working directory    |         
    | ls                      | List the contents of a particular directory |
    | cd `<name>`             | Change directory                            |
    | cd `<name>/<subfolder>` | Changes directory to a specific folder / subfolder |
    | cd `..`                 | Go up a directory                           |
    | cd `~`                  | Go to the user's home directory |
    | cd `/`                  | Go to the root directory
    | mkdir `<name>`          | Creates a new directory                     |
    | rmdir `<name>`          | Removes a directory                         |
    | rm `<file-name>`        | Removes a file by name                      |
2. Write Git Commands on the Whiteboard
    #### See current status of working files and repository

    > Encourage them to run this after every command to see what has changed and what hasn't

    ```
    git status
    ```

    #### Pull Lecture/Solution Code
    ```
    git pull origin master
    ```

    #### Pull New Exercise Code
    ```
    git pull upstream master
    ```

    #### Push Exercise Code
    ```
    git add .
    git commit -m "My commit message"
    git push origin master
    ```

## **Agenda and Timing for Session:** 
(General order of topics and timing (minutes))

* Become familiar with the laptop they will be using in class (0:15)
* Break to fill out StrengthsFinder (0:30)
* Shell and File System (0:45)
* Explain purpose and benefit of using source control (0:15)
* Git Remote Repositories (0:15)
  
## **Topic List w/Notes** <div class=topicNote>(and <span class='link'>links</span> to e-book section when available)
(What will we teach them in order to successfully meet Module Objectives)

- ### Become familiar with the laptop they will be using in class
    - Show them how to navigate system using window manager
    - Show them where browser is (Either Chrome or Firefox)
    - Point out anything about OS that they may not be familiar with
    - Show them how and encourage them to change password on laptop


- ### Break to fill out StrengthsFinder

- ### [Shell and File System](http://book.techelevator.com/java/introduction-to-tools/shell-and-file-system/1_intro.html)
  <!-- File System -->
    <h4>File System Definition:</h4> The file system is a method for storing and organizing files and the data that they contain. They are organized into tree structures. Drives contain folders and folders contain files.

    <!-- Analogy -->
    <h5>Analogy</h5>A hard drive is like a file cabinet. File cabinets have folders which serve as containers to various files.

    - ### [File System](http://book.techelevator.com/java/01-introduction-to-tools/shell-and-file-system/2_file-system.html)
        - Files are the parts of the file system that contain the stuff we want. Documents, songs, spreadsheets, etc.
        - Folders hold other folders and files. *All files exist in some folder in the file system.*
        - All of these objects have metadata that describe them. Things like modified dates, names, and permissions are pieces of data that are attached to files and folders as part of the file system.

    - ### [What is a Shell](http://book.techelevator.com/java/01-introduction-to-tools/shell-and-file-system/3_what-is-a-shell.html)

        <h4>Shell Definition</h4>The <strong>shell</strong> provides a text-based interface to interacting with the file system.
    
        - In a shell, you write lines of code that the computer understands to get the computer to do what you want.
        - Many tasks in programming are done on the command line because it is more flexible than most GUI interfaces and can be scripted.
        - We will be using a very popular shell called `bash`.
        - On the Mac we will be using the <strong>Terminal</strong> application and the PC will use a program called <strong>Git Bash</strong>. 


    - ### [Navigating the File System](http://book.techelevator.com/java/introduction-to-tools/shell-and-file-system/4_file-system-and-shell.html)

        - #### Changing Directories
        ```
        cd <directory name>
        ```
        - #### Print Working Directory
        ```
        pwd
        ```
        - #### List Directory Contents
        ```
        ls -al
        ```
        - #### Working with Files and Folders
            - ##### Moving Files and Folders
            ```
            mv <oldname> <newname>
            ```
            - ##### Copying Files and Folders
            ```
            cp <oldname> <newname>
            ```
            - ##### Making Folders
            ```
            mkdir <newfolder>
            ```
            
        > #### Instructor Led Exercise
        > (Exercise performed by the instructor with students following along their laptops)
        >
        > Walk the student through navigating the file system by opening **Explorer** or **Finder**. Show them the list view so they can see nested folders and the folder hierarchy.
        >
        > Then take them into the command line and do the same.
        >
        > ##### Take them to their home directory
        > ```
        > cd ~
        > ```
        >
        > ##### Where are you?
        > ```
        > pwd
        > ```
        >
        > ##### Show them you can see the files, folders, and their metadata
        > ```
        > ls -al
        > ```
        >
        > ##### Create a new folder
        > ```
        > mkdir testfolder
        > ```
        >
        > ##### Go into your new folder (relative)
        > ```
        > cd testfolder
        > ```
        >
        > ##### Now where are we?
        > ```
        > pwd
        > ```
        >
        > ##### How else could we have gotten there? (~)
        > ```
        > cd ~/testfolder
        > ```
        >
        > ##### How else? (absolute)
        > ```
        > cd /<absolute path to your home directory>/testfolder
        > ```
        >
        > ##### Make a new file called test.txt and save it here
        > ```
        > code test.txt
        > ```
        > Edit this file then save it
        >
        > ##### Where are we?
        > ```
        > pwd
        > ```
        >
        > ##### What's here?
        > ```
        > ls -al
        > ```
        >
        > ##### Let's rename the file (no rename command, we need to move it)
        > ```
        > mv test.txt readme.txt
        > ```
        >
        > ##### Let's make a copy of the file
        > ```
        > cp readme.txt duplicate.txt
        > ```
        >
        > ##### What's here?
        > ```
        > ls -al
        > ```
        >
        > ##### What's in duplicate?
        > ```
        > cat duplicate.txt
        > ```
        > Tell them there are many more commands to learn, if they want.
        >
        > ##### Let's delete these files and the folder
        > ```
        > cd ..
        > rm testfolder
        > ```
        >
        > ##### That didn't delete it, why?
        > ```
        > rm -r testfolder
        > ```
        > 
        > ##### Points to Make
        >
        > - The words folder and directory are often used interchangeably.
        > - The place where all folders start is the root folder or root directory. It is signified by a `/`.
        > - A full path to a folder can be made by starting at the root `/` and then adding on all the folders along the path to the file, separated by `/`. EX: /var/local/bin/code would start at root, go into the var folder, then the local folder in that, then the bin folder in that and then to code.
        > - Your files will reside in your home folder. That will always be `~`.
        > - We will see this structure again when talking about HTML.
        > - Absolute paths are paths that start at the root folder. Relative paths are paths that start from where you are now.
        >
        >    
        >
        >    #### Caution
        >    Some students will be confused by absolute and relative pathing, so you will probably need to spend some time here explaining it a couple of times. You will also see students doing it wrong throughout the cohort.
        >    
        >
        >    
        >
        >    #### Walking down the path
        >    Explain to students that they should visualize walking down the path of the directories. When they start at `/` or `~`, they will then need to specify each directory that makes a path to where they want to go.
        >    
        >
        >    
        >
        >    #### You are here
        >    It's hard for students to know where they are in the directory structure. There's no good indicator of this in the default bash prompt. They may not get the concept that they are currently in a specific directory. Encourage them to run `pwd` whenever they can to anchor them in the file structure.
        >    
        >
        > - No news is good news. If a message is shown after running a command, read it because it is probably an error. Most commands say nothing on success.
        > - Press the up arrow (&uarr;) to cycle through previous commands instead of retyping
        > - Use the `tab` key to automatically complete the path.
        > - **PC** From the PC we can also open a Git Bash window directly from the file explorer. The benefit of doing this is that it will take us directly to our intended location.
    
    - ### Running Shell Scripts

        - Commands can be grouped into a script file and executed all at once.
        - We can code scripts to handle repetitive tasks that we do often on the computer.

        > #### Instructor Led Exercise
        > (Exercise performed by the instructor with students following along their laptops)
        >
        > ##### Go to your home directory
        > ```
        > cd ~
        > ```
        >
        > ##### Create a new file called setup.sh
        > ```
        > code setup.sh
        > ```
        >
        > ##### Open the machine setup script you configured in setup step 1 in a browser and send URL to students via Ryver
        >
        > ##### Have students copy and paste the content into their setup.sh script
        >
        > ##### Have them go back to their shell and run it
        > ```
        > sh ./setup.sh
        > ```
        >
        > ##### They will now log into Bitbucket and their source code repositories will be set up for them
        >
        > As this is running, talk about how we can group commands like this to create simple applications on the command line to handle repetitive tasks that we don't want to do ourselves.
        >
        > 
        >
        > #### Caution
        >
        > Some students will forget their passwords or generally mess up running this script. This is a great time to take a break and work with the students to get these repositories ironed out. Running the script over again will not cause a problem, but it might be helpful to delete any repositories that did succeed before running it to recreate any that didn't.

    - ### Additional Shell Commands / References - [Next Steps Book Chapter](http://book.techelevator.com/java/01-introduction-to-tools/shell-and-file-system/5_next-steps.html)



- ### [Git](http://book.techelevator.com/java/introduction-to-tools/version-control/3_what-is-github.html)

    <!-- Version Control -->
    ><h5>Version Control Definition</h5><span>Version Control</span> systems record changes to a file or sets of files so that previous versions can be recalled at a later point in time.

    <h5>Analogy</h5><span>Version Control</span> is analogous to a save point in a video game. We create checkpoints so that we can return to them at a later point in time if something goes wrong.

    <!-- Git -->
    ><h5>Git Definition</h5><span>Git</span> is a distributed version control system that keeps a copy of its changes and file sets in a repository.

    When working with Git we follow a workflow of steps.

    1. Clone - Create a copy of a remote repository on your local computer.
    2. Add - Tell Git about changes that you would like to commit.
    3. Commit - Save the change locally by creating a checkpoint or *changeset*.
    4. Push - Copy changes into a *remote* repository.

- ### [The Git Workflow](http://book.techelevator.com/java/introduction-to-tools/version-control/5_git-workflow.html)
     ![The Git Workflow](../../resources/git-workflow.png)

-   #### Git Commands

    1. **Check Status using `git status`**

    2. **[Stage Changes](http://book.techelevator.com/java/introduction-to-tools/version-control/7_staging-changes.html) using `git add`**

        

        ##### Instructor Note:
        Be sure to show `git add <file-name>`, `git add <folder-name>`, and `git add .`

        

        
    
        ##### CAUTION
    
        Running `git add` doesn't do anything except *prepare* a change to be committed. Students will think that it is putting into Git, but you need to really emphasize that their workflow will be to **both** `git add .` and then `git commit` every time they make a change.
    
        </div>

    3. **[Committing Changes](http://book.techelevator.com/java/introduction-to-tools/version-control/8_committing-changes.html) using `git commit -m"Commit Message"`**

    4. **View History using `git log`**

    5. **Git Remotes using `git remote`**    
        - <div class="definition note"><h5>Local Repository Definition</h5>A <span>local repository</span> is the copy of the code on your development computer.</div>
        - <div class="definition note"><h5>Remote Repository Definition</h5>A <span>remote repository or git remote</span> is another repository that your local repository is connected to. This is often a website like Bitbucket that allows you to push your code to its secure backup server.</div>
  
    6. **[Pushing and Pulling](http://book.techelevator.com/java/introduction-to-tools/version-control/9_pushing-pulling-changes.html) using `git push` or `git pull`**
        - **Push** - the act of copying our local committed changesets to the remote repository.
        - **Pull** - the act of downloading any new changesets from the remote repository to our local copy.


- #### Git Remote Repositories
![Git Remote Repositories](../../resources/git-remotes.png)

> #### Instructor Led Exercise
>
> - Explain the idea of local and remote repositories and the purpose of each remote, using the following diagram:
>    ![Upstream and Remote](../../resources/upstream-origin.png)
> - Walk the students through opening their exercises via the command line from their local exercises repository
> - Change the exercise file for today and demonstrate adding, committing and pushing the change to mimic their homework submission process using commands written on the board from Classroom Preparation step 3
>
> ##### Points to Make
>
> - Commit early and commit often. You can push as many times as you want and should do it often. Waiting until you have completed everything is a good way to forget to submit exercises. You have a free online backup of all your work, so use it.
> - `origin` is your repository that you will *push* to, `upstream` is where new exercises will go that you will *pull* from.
>
> 
>
> #### The River Git
>
> You can think of upstream as you would a river. Things flow *from* upstream, so you need to pull from that to get the new stuff.
>
> 
>
> - You don't need to know how every piece of this works to use it. Just remember to `add`, `commit`, and `push`.
>
> 
>
> #### Caution - Workflow Mixups
>
> Students often have a hard time internalizing these commands and this workflow. Try to get them to understand that they need to `add`, then `commit` and then `push` to submit exercises. Don't worry too much about them getting this now though, they will be doing it every day from now on.
>
> 

## Student Exercises (Individual)
(Exercises to be performed by individual students)

Exercises for today are a series of commands that the students will write to produce a directory structure on their machine. A `verify.sh` script is provided for them to validate that they completed the exercise correctly. It is best if the instructor walks the students through the first two or three steps and shows them how to validate they're doing the work correctly. The `verify.sh` script will produce an output file that should be submitted for verification of exercise completion.


## Instructor References
(Information and Links to Assist the Instructor in Doing the Lecture)


| Git Command | Description |
|-------------|-------------|
| **`git remote`** | List remote connections to another repository |
| **`git remote -v`** | List remote repositories and their URLs |
| **`git remote add <name> <url>`** | Create a new connection to a remote repository|
| **`git remote rm <name>`** | Remove a connection from a remote repository |
| **`git push <name> <branch>`** | Copies all committed changes to the remote repository |
| **`git pull <name> <branch>`** | Copies all changes in remote repository to your local |

[Git workflow diagram](http://images.osteele.com/2008/git-transport.png)
  


## Cheat Sheets & References
(Summaries or Links to Reference Material/Cheat Sheets)

| Reference | Description |
|-----------|-------------|
| [Git Cheat Sheet](https://drive.google.com/open?id=0Bz4DHj0l-C66QjRfN05LWWZIRGs) | GitHub cheat sheet. |
| [Shell Command Cheat Sheet](https://drive.google.com/open?id=0Bz4DHj0l-C66ak9ZZVc0cjNZZU0) | Shell command cheat sheet. |
| [Apple OS X Command Line Reference](http://ss64.com/osx/) | Comprehensive index of commands for the OS X command line |
