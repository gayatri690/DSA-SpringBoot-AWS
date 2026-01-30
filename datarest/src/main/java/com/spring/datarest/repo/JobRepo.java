package com.spring.datarest.repo;


//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.spring.datarest.model.JobPost;



@RepositoryRestResource(path = "jobPost")
public interface JobRepo extends CrudRepository<JobPost,Integer> {


    // ArrayList to store JobPost objects
//    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//
//            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
//
//
//            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
//                    List.of("HTML", "CSS", "JavaScript", "React")),
//
//
//            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//                    List.of("Python", "Machine Learning", "Data Analysis")),
//
//
//            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
//                    List.of("Networking", "Cisco", "Routing", "Switching")),
//
//
//            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
//                    List.of("iOS Development", "Android Development", "Mobile App"))
//    ));

    // method to return all JobPosts
//    public List<JobPost> getAllJobs() {
//        return jobs;
//    }
//
//    // method to save a job post object into arrayList
//    public void addJob(JobPost job) {
//        jobs.add(job);
//        System.out.println(jobs);
//
//    }
//
//	public JobPost getjob(int jobid) {
//		// TODO Auto-generated method stub
//		for(JobPost jb:jobs){
//			if(jb.getPostId()==jobid) {
//				return jb;
//			}
//		}
//		return null;
//	}
//
//	public void updateJob(JobPost jb) {
//		// TODO Auto-generated method stub
//		for(JobPost jb1:jobs) {
//			if(jb1.getPostId()==jb.getPostId()) {
//				jb1.setPostId(jb.getPostId());
//				jb1.setPostDesc(jb.getPostDesc());
//				jb1.setPostProfile(jb.getPostProfile());
//				jb1.setPostTechStack(jb.getPostTechStack());
//				jb1.setReqExperience(jb.getReqExperience());
//			}
//		}
//	}
//
//	public void deletejob(int jobid) {
//		// TODO Auto-generated method stub
//		for(JobPost jb1:jobs) {
//			if(jb1.getPostId()==jobid) {
//				jobs.remove(jb1);
//			}
//		}
//	}


}
