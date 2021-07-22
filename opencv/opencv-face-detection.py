import cv2

face_cascade = cv2.CascadeClassifier('haarcascade_frontalface_default.xml')
# eye_cascade = cv2.CascadeClassifier('haarcascade_eye.xml')

cap = cv2.VideoCapture(0)

while 1:

	ret, img = cap.read()

	# convert to gray scale of each frames
	gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

	# Detects faces of different sizes in the input image
	faces = face_cascade.detectMultiScale(gray, 1.3, 5)
	font = cv2.FONT_HERSHEY_PLAIN

	for (x,y,w,h) in faces:
		# To draw a rectangle in a face
		cv2.rectangle(img,(x,y),(x+w,y+h),(255,255,0),2)
		cv2.putText(img, 'Avijit', (int(y+(y+h)/3), x+w), font, 3, (255, 255, 255), 4, cv2.LINE_8)
		# roi_gray = gray[y:y+h, x:x+w]
		# roi_color = img[y:y+h, x:x+w]
		cv2.imwrite('face.jpg', img)

		# face found exit the window
		cap.release()
		# De-allocate any associated memory usage
		cv2.destroyAllWindows()

		# Detects eyes of different sizes in the input image
		# eyes = eye_cascade.detectMultiScale(roi_gray)

		# To draw a rectangle in eyes
		# for (ex,ey,ew,eh) in eyes:
		# 	cv2.rectangle(roi_color,(ex,ey),(ex+ew,ey+eh),(0,127,255),2)

	# Display an image in a window
	cv2.imshow('img',img)

	# Wait for Esc key to stop
	k = cv2.waitKey(30) & 0xff
	if k == 27:
		break

# Close the window
cap.release()

# De-allocate any associated memory usage
cv2.destroyAllWindows()
