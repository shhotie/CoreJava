package com.comparator;

import java.util.Comparator;

import com.job.JobSeeker;

public class DateComparator implements Comparator<JobSeeker> {

	@Override
	public int compare(JobSeeker o1, JobSeeker o2) {
		return o1.getGrDate().compareTo(o2.getGrDate());
	}

}
