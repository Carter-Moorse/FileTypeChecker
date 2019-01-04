# File Identifier
This module provides a fast and easy way to identify the MIME type of any file. It does this using a combination of the contents and the filename of the input file. 

## Configuration
Add the Java action to a microflow and insert a specialization of a FileDocument. The Java action returns a string with the best guess of the MIMI-type of the file.

## Dependencies
This module uses the Apacha Tika Core library.

## Limitations
This module does not verify the integrity of a file. To be able to do that you need to parse the full contents of a file, which is more time and memory consuming. 

## Tested with the following file formats
  Images
  - GIF
  - JPG / JPEG
  - BMP
  - PNG
  
  Documents
  - PDF