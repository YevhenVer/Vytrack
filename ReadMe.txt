# Naming convention:
if you see same functionality name: share the page and communicate with each other

      Feature file: US01_FunctionalityName_nameInitials.feature
      EX:           US12_CustomerInfo_OC.feature

      Pages class:  PageName_page_nameInitials.java
      EX:           CustomerInfo_page_OC.java

      Step Definition: US01_FunctionalityName_stepDef_nameInitials.java
      EX:              US012_CustomerInfo_stepDef_OC.java

      GIT branch name: US01_UserName
      EX:              US12_OwenC



# GIT FLOW:
            Branch that we will push changes: master branch
- write your codes
- do commits
- after last commit
- update your local master branch ("fetch" and "pull" or "update")
- merge master into your branch
- then you push from your local branch to your origin(remote) branch
- On GIT create a pull request(base:master, compare:yourBranch) from your origin branch to master branch
- then assign your assignee(communicate to them(send a discord message))


# important
- do not touch the utilities (stays as it is)
- do not push to  and  work on "master" branches