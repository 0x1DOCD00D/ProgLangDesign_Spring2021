# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.17

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = "/Users/drmark/Library/Application Support/JetBrains/Toolbox/apps/CLion/ch-0/203.7148.70/CLion.app/Contents/bin/cmake/mac/bin/cmake"

# The command to remove a file.
RM = "/Users/drmark/Library/Application Support/JetBrains/Toolbox/apps/CLion/ch-0/203.7148.70/CLion.app/Contents/bin/cmake/mac/bin/cmake" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/drmark/github/ProgLangDesign_Spring2021/Feb17

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/drmark/github/ProgLangDesign_Spring2021/Feb17/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/Feb17.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Feb17.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Feb17.dir/flags.make

CMakeFiles/Feb17.dir/main.cpp.o: CMakeFiles/Feb17.dir/flags.make
CMakeFiles/Feb17.dir/main.cpp.o: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/drmark/github/ProgLangDesign_Spring2021/Feb17/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Feb17.dir/main.cpp.o"
	/Library/Developer/CommandLineTools/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Feb17.dir/main.cpp.o -c /Users/drmark/github/ProgLangDesign_Spring2021/Feb17/main.cpp

CMakeFiles/Feb17.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Feb17.dir/main.cpp.i"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/drmark/github/ProgLangDesign_Spring2021/Feb17/main.cpp > CMakeFiles/Feb17.dir/main.cpp.i

CMakeFiles/Feb17.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Feb17.dir/main.cpp.s"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/drmark/github/ProgLangDesign_Spring2021/Feb17/main.cpp -o CMakeFiles/Feb17.dir/main.cpp.s

CMakeFiles/Feb17.dir/run.cpp.o: CMakeFiles/Feb17.dir/flags.make
CMakeFiles/Feb17.dir/run.cpp.o: run.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/drmark/github/ProgLangDesign_Spring2021/Feb17/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object CMakeFiles/Feb17.dir/run.cpp.o"
	/Library/Developer/CommandLineTools/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Feb17.dir/run.cpp.o -c /Users/drmark/github/ProgLangDesign_Spring2021/Feb17/cmake-build-debug/run.cpp

CMakeFiles/Feb17.dir/run.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Feb17.dir/run.cpp.i"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/drmark/github/ProgLangDesign_Spring2021/Feb17/cmake-build-debug/run.cpp > CMakeFiles/Feb17.dir/run.cpp.i

CMakeFiles/Feb17.dir/run.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Feb17.dir/run.cpp.s"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/drmark/github/ProgLangDesign_Spring2021/Feb17/cmake-build-debug/run.cpp -o CMakeFiles/Feb17.dir/run.cpp.s

# Object files for target Feb17
Feb17_OBJECTS = \
"CMakeFiles/Feb17.dir/main.cpp.o" \
"CMakeFiles/Feb17.dir/run.cpp.o"

# External object files for target Feb17
Feb17_EXTERNAL_OBJECTS =

Feb17: CMakeFiles/Feb17.dir/main.cpp.o
Feb17: CMakeFiles/Feb17.dir/run.cpp.o
Feb17: CMakeFiles/Feb17.dir/build.make
Feb17: CMakeFiles/Feb17.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/drmark/github/ProgLangDesign_Spring2021/Feb17/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Linking CXX executable Feb17"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Feb17.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Feb17.dir/build: Feb17

.PHONY : CMakeFiles/Feb17.dir/build

CMakeFiles/Feb17.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/Feb17.dir/cmake_clean.cmake
.PHONY : CMakeFiles/Feb17.dir/clean

CMakeFiles/Feb17.dir/depend:
	cd /Users/drmark/github/ProgLangDesign_Spring2021/Feb17/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/drmark/github/ProgLangDesign_Spring2021/Feb17 /Users/drmark/github/ProgLangDesign_Spring2021/Feb17 /Users/drmark/github/ProgLangDesign_Spring2021/Feb17/cmake-build-debug /Users/drmark/github/ProgLangDesign_Spring2021/Feb17/cmake-build-debug /Users/drmark/github/ProgLangDesign_Spring2021/Feb17/cmake-build-debug/CMakeFiles/Feb17.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/Feb17.dir/depend
