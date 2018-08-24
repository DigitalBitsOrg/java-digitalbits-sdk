#echo "machine github.com login digitalbits-jenkins password $GITHUB_TOKEN" >~/.netrc
git clone -b gh-pages "git+ssh://git@github.com/digitalbitsorg/java-digitalbits-sdk.git" javadoc

if [ ! -d "javadoc" ]; then
  echo "Error cloning"
  exit 1
fi

rm -rf javadoc/* # Remove all files without hidden (.git)
javadoc -public -splitindex -windowtitle "java-digitalbits-sdk documentation" -d ./javadoc -sourcepath ./src/main/java/ -subpackages io.digitalbits.sdk -exclude io.digitalbits.sdk.xdr
cd javadoc
git add .
git commit -m $TRAVIS_TAG
git push origin gh-pages
