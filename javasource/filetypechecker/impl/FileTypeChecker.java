package filetypechecker.impl;

import org.apache.tika.Tika;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import java.io.InputStream;

public class FileTypeChecker {

	public String getFileType(IMendixObject inputFile, IContext context) throws Exception {

		InputStream inputStream = null;
		TikaInputStream tikaStream = null;
		String mimeType;

		try {
			Tika tika = new Tika();
			inputStream = Core.getFileDocumentContent(context,inputFile);
			tikaStream = TikaInputStream.get(inputStream);
			Metadata metadata = new Metadata();
			String fileName = inputFile.getMember(context, "Name").getValue(context).toString();
			metadata.set(Metadata.RESOURCE_NAME_KEY, fileName);
			mimeType = tika.detect(tikaStream, metadata);
			
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			
			if (tikaStream != null) {
				tikaStream.close();
			}
		}

		return mimeType.toString();
	}
}
