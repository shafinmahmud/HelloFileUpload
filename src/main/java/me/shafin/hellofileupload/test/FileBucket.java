package me.shafin.hellofileupload.test;

import org.springframework.web.multipart.MultipartFile;

public class FileBucket {

    MultipartFile file;
     
    public FileBucket(){
    	
    }
    
    public MultipartFile getFile() {
        return file;
    }
 
    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
