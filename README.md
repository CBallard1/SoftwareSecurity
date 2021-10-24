# SoftwareSecurity
CS305 - Software Security

Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

  Artemis Financial was a financial consulting firm managing savings, retirement, investment, and insurance plans. They wanted to modernize and secure their existing RESTful API     to protect their customers and themselves from external threats. 

What did you do particularly well in identifying their software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?
  
  I feel I was able to effectively identify areas of code where sufficient checks were not in place to prevent denial of service attacks. It is important to code securely because    all software is subject to attacks especially software that will handle personal identifiable information. Software security adds to a company's overall well-being by              establishing trust with their customers and ensuring that the company can perform their day-to-day business with some assurance that their operations and clients are protected    from malicious actors.

What about the process of working through the vulnerability assessment did you find challenging or helpful?
  
  The most challenging thing I found during the vulnerability assessment was the sheer scale. There is a lot of information to process.

How did you approach the need to increase layers of security? What techniques or strategies would you use in the future to assess vulnerabilities and determine mitigation techniques?

  Start with the biggest, broadest security measures possible. In my opinion, you want to get the big security layers in place before you worry too much about the granular           security layers. You obviously cannot code against every possibly vulnerability so covering as many of them at one time early on will allow you to focus more time on very         specific use cases and really make it difficult for malicious actors to cause havoc in your software.

How did you ensure the code and software application were functional and secure? After refactoring code, how did you check to see whether you introduced new vulnerabilities?
  
  I ran some tests of my code in the secure server by passing different arguments into the API; nothing comprehensive, but just checking that general errors did not result in catastrophic outcomes. I also re-ran the vulnerability assessment to make sure that any new libraries I included did not introduce additional risks. 

What resources, tools, or coding practices did you employ that you might find helpful in future assignments or tasks?

  I used StackOverflow, YouTube, and Google to search the problem I was trying to solve and to find additional websites addressing applying security layers to APIs.

Employers sometimes ask for examples of work that you have successfully completed to demonstrate your skills, knowledge, and experience. What from this particular assignment might you want to showcase to a future employer?

  I would probably point to my vulnerability assessment and manual code review as my most comprehensive completed assignment. 
