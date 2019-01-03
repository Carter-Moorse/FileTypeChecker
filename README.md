## File Identifier
Identify the MIME-type of any file.

## Configuration
Add the Java action to a microflow and insert a (generalization of) FileDocument. Return a string with the best guess of the MIMI-type of the file based on content-type and filename. 

## Dependencies
This module uses Apacha Tika Core library v1.20.

## Limitations
For some filetypes it is really dificult to detect the content. 
