package http;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import com.jcraft.jsch.*;
import org.apache.log4j.Logger;

public class SftpLoad {

    private static Logger logger = Logger.getLogger(SftpLoad.class);


    /*
     * ��SFTP�����������ļ�
     *
     * @param ftpHost SFTP IP��ַ
     *
     * @param ftpUserName SFTP �û���
     *
     * @param ftpPassword SFTP�û�������
     *
     * @param ftpPort SFTP�˿�
     *
     * @param ftpPath SFTP���������ļ�����·�� ��ʽ�� ftptest/aa
     *
     * @param localPath ���ص����ص�λ�� ��ʽ��H:/download
     *
     * @param fileName �ļ�����
     */
    public static void downloadSftpFile(String ftpHost, String ftpUserName,
                                        String ftpPassword, int ftpPort, String ftpPath) throws JSchException {
        Session session = null;
        Channel channel = null;

        JSch jsch = new JSch();
        session = jsch.getSession(ftpUserName, ftpHost, ftpPort);
        session.setPassword(ftpPassword);
        session.setTimeout(100000);
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        if (!session.isConnected())
            session.connect();

        channel = session.openChannel("sftp");

        if (!channel.isConnected())
            channel.connect();

        ChannelSftp chSftp = (ChannelSftp) channel;


        try {
            InputStream inputStream = chSftp.get(ftpPath);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.replace("\"", "");
                String[] info = line.split(",");
                System.out.println("size:" + info.length);

                System.out.println("str:" + line);
                if (info != null)
                    for (int i = 0; i < info.length; i++)
                        System.out.println("str:" + info[i]);

            }

        } catch (Exception e) {
            e.printStackTrace();
            logger.info("download error.");
        } finally {
            chSftp.quit();
            channel.disconnect();
            session.disconnect();
        }

    }


    public static void main(String[] args) {

        String ftpHost = "115.182.53.132";
        String ftpUserName = "sftp_chinabyte";
        String ftpPassword = "newsletter.chinabyte.(!com)";
        int ftpPort = 22;
        String ftpPath = "/usr/hanqinet/chinabyte/auto_output_data/201801/CLICKS20180111.csv";

        try {
            SftpLoad.downloadSftpFile(ftpHost, ftpUserName, ftpPassword, ftpPort, ftpPath);
        } catch (JSchException e) {
            e.printStackTrace();
        }

    }


}