package br.com.magna.service;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.revwalk.RevCommit;

public class GitRepositoryManager {
	
	public static void main(String[] args) throws IOException, NoHeadException, GitAPIException {
		new GitRepositoryManager().lerRepositorio();
	}

	public void lerRepositorio() throws IOException, NoHeadException, GitAPIException {
		File gitWorkDir = new File("C:\\Users\\alber\\eclipse-workspace\\store-rest");
		Git git = Git.open(gitWorkDir);
		System.out.println(git);
		Iterable<RevCommit> log = git.log().call();
		for (RevCommit revCommit : log) {
			System.out.println(revCommit.getFullMessage());
		}
	}
}
