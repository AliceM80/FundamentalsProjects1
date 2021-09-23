Step 1: Open Terminal and install IntelliJ IDE through the Homebrew command:
		brew install --cask intellij-idea-ce

Step 2: Open IntelliJ IDE.

Step 3: Download and install a JDK by:
		- Create a New Project.
		- Select Java from the right sidebar.
		- Under "Project SDK" select "Download JDK".
		- Select Amazon Corretto version 11.

Step 4: Continue without selecting a template.

Step 5: Assign a name and address to the project.

Step 6: Through the Terminal, create a local git repo and connect it to the remote  Github repo.
		Pull the remote repo to download all the current files and be updated.

-----------------------------------------------------------------------------------------------------
			git init
			git remote add origin “GitHub url”
			git remote -v
			git checkout -b main
			git pull origin main
			Make changes (create folders and the Hello World app)
                         Git add-commit -m “something”  (this is a shortcut I created but you can
							just to the git add and then git commit -m 
							commands separately)
			Git push origin main
-----------------------------------------------------------------------------------------------------
Step 7: Through the Terminal, create folders with the command:
		
		mkdir -p src/{main,test}/{java,resources}

Step 8: Inside IntelliJ, select the "java" folder inside the "main" folder.

Step 9: Go to File and create a new Java Class, and name it "main".

Step 10: Inside the "main" Java Class create the Hello World app with the next code:
		
		public class main {
    			public static void main(String[] args){
        				System.out.println("Hello World !!!");
    				}
		}

Step 11: Commit the changes and push them to the remote repo.
