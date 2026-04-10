# Project Architecture
# The project is built on a Modular Logic structure. Instead of a single linear script, it uses a loop-driven cycle that maintains the program's "life" until a specific termination command is received.

# Core Modules
# Input Listener: Monitor the console for numerical data and mathematical operators.
# Command Parser: A logic layer that identifies if the user wants to calculate or exit (e.g., checking for 'x').
# Execution Engine: Uses enhanced switch expressions to perform arithmetic operations.
# Exception Handler: A safety net that catches invalid characters or mathematical errors (like division by zero) without crashing the program.

# 🚀 Technical Features
# Infinite Operational Loop: Implemented via a while(true) structure, allowing for repetitive use without restarts.
# Pattern Matching & Switch Expressions: Leverages Java 21's arrow syntax (->) for more concise and readable logic compared to traditional case/break blocks.
# Buffer Management: Clears the Scanner buffer after errors to prevent infinite error loops.
# Formatted Output: Uses System.out.printf to provide scientific-grade precision (e.g., limiting results to two decimal places).

# 📊 Logic Flowchart
# The application follows a specific lifecycle for every calculation:
# Start: Display the "Coding Monastery" or "Advanced Calc" welcome banner.
# Input A: Wait for a number or the 'x' exit command.
# Operator: Identify the mathematical action (+, -, *, /).

# Input B: Wait for the second numerical value.
# Process: Execute logic and display the formatted result.
# Recycle: Return to step 2.

# 🎯 Learning Outcomes
# By developing this project, you master:
# Data Validation: Ensuring the software only processes "clean" data.
# State Management: Keeping the app running and responsive.
# Java 21 Syntax: Utilizing modern features that make Java faster and more readable.