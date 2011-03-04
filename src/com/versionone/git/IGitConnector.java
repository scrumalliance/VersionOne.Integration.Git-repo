package com.versionone.git;

import java.util.List;

public interface IGitConnector {
    void cleanupLocalDirectory();
    void initRepository() throws GitException;
    List<ChangeSetInfo> getCommits() throws GitException;
}
