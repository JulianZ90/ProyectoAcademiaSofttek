function genPDF() {
		html2canvas(document.body, {
			onrendered: function (canvas) {
			
				var img = canvas.toDataURL("image/png");
				var doc = new jsPDF('l', 'mm', [350, 210]);
				doc.addImage(img, 'JPEG',0,0);
				doc.save('reporte.pdf');
			}
		});
	
	
	}