int xPos1 = 125;
int xPos2 = 375;

int yPos1 = 125;
int yPos2 = 375;

int d = 100;

void setup() {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the screenshot in the files 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 
// Try different expressions and see what happens!
  background(255);
  stroke(0);
  fill(175, 175, 255);
  ellipse(xPos1, yPos1, d, d);
  ellipse(xPos2, yPos1, d, d);
  ellipse(xPos2, yPos2, d, d);
  ellipse(xPos1, yPos2, d, d);
  
 
}