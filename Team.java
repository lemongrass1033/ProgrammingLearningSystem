package com.mycompany.programminglearningsystem.model;

public class Material
        implements Downloadable {

    private int topicID;
    private int materialID;
    private String fileName;
    private String fileType;

    public Material(
            int materialID,
            String fileName,
            String fileType,
            int topicID) {

        this.materialID = materialID;
        this.fileName = fileName;
        this.fileType = fileType;
        this.topicID = topicID;
    }

    public String getFileName() {
        return fileName;
    }

    public int getMaterialID() {
        return materialID;
    }

    public String getFileType() {
        return fileType;
    }

    public int getTopicID() {
        return topicID;
    }

    @Override
    public void downloadMaterial() {

        System.out.println(
                fileName
                + " downloaded successfully");
    }
}